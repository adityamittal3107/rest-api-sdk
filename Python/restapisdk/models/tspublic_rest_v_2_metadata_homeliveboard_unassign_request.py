# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class TspublicRestV2MetadataHomeliveboardUnassignRequest(object):

    """Implementation of the 'Tspublic Rest V2 Metadata Homeliveboard Unassign Request' model.

    TODO: type model description here.

    Attributes:
        user_name (string): Name of the user
        user_id (string): The GUID of the user

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "user_name": 'userName',
        "user_id": 'userId'
    }

    def __init__(self,
                 user_name=None,
                 user_id=None):
        """Constructor for the TspublicRestV2MetadataHomeliveboardUnassignRequest class"""

        # Initialize members of the class
        self.user_name = user_name
        self.user_id = user_id

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

        user_name = dictionary.get('userName')
        user_id = dictionary.get('userId')
        # Return an object of this model
        return cls(user_name,
                   user_id)
