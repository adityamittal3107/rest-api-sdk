# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.models.ts_object_input import TsObjectInput


class TspublicRestV2MetadataFavoriteUnassignRequest(object):

    """Implementation of the 'Tspublic Rest V2 Metadata Favorite Unassign Request' model.

    TODO: type model description here.

    Attributes:
        user_name (string): Name of the user
        user_id (string): The GUID of the user
        ts_object (list of TsObjectInput): A JSON Array of GUIDs and type of
            metadata object.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "ts_object": 'tsObject',
        "user_name": 'userName',
        "user_id": 'userId'
    }

    def __init__(self,
                 ts_object=None,
                 user_name=None,
                 user_id=None):
        """Constructor for the TspublicRestV2MetadataFavoriteUnassignRequest class"""

        # Initialize members of the class
        self.user_name = user_name
        self.user_id = user_id
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
        user_name = dictionary.get('userName')
        user_id = dictionary.get('userId')
        # Return an object of this model
        return cls(ts_object,
                   user_name,
                   user_id)
