# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.models.ts_object_input import TsObjectInput


class TspublicRestV2MetadataTagUnassignRequest(object):

    """Implementation of the 'Tspublic Rest V2 Metadata Tag Unassign Request' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the tag
        id (string): The GUID of the tag
        ts_object (list of TsObjectInput): A JSON Array of GUIDs and type of
            metadata object.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "ts_object": 'tsObject',
        "name": 'name',
        "id": 'id'
    }

    def __init__(self,
                 ts_object=None,
                 name=None,
                 id=None):
        """Constructor for the TspublicRestV2MetadataTagUnassignRequest class"""

        # Initialize members of the class
        self.name = name
        self.id = id
        self.ts_object = ts_object

    @classmethod
    def from_dictionary(cls,
                        dictionary):
        """Creates an instance of this model from a dictionary

        Args:
            dictionary (dictionary): A dictionary representation of the object
            as obtained from the deserialization of the server's response. The
            keys MUST match property names in the API description.

        Returns:
            object: An instance of this structure class.

        """
        if dictionary is None:
            return None

        # Extract variables from the dictionary
        ts_object = None
        if dictionary.get('tsObject') is not None:
            ts_object = [TsObjectInput.from_dictionary(x) for x in dictionary.get('tsObject')]
        name = dictionary.get('name')
        id = dictionary.get('id')

        # Return an object of this model
        return cls(ts_object,
                   name,
                   id)
