# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.models.meta_object_input import MetaObjectInput


class ApiRestV2MetadataFavoriteAssignRequest(object):

    """Implementation of the 'Api Rest V2 Metadata Favorite Assign Request' model.

    TODO: type model description here.

    Attributes:
        user_name (string): Name of the user
        user_id (string): The GUID of the user
        meta_object (list of MetaObjectInput): Metadata object details

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "meta_object": 'metaObject',
        "user_name": 'userName',
        "user_id": 'userId'
    }

    def __init__(self,
                 meta_object=None,
                 user_name=None,
                 user_id=None):
        """Constructor for the ApiRestV2MetadataFavoriteAssignRequest class"""

        # Initialize members of the class
        self.user_name = user_name
        self.user_id = user_id
        self.meta_object = meta_object

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
        meta_object = None
        if dictionary.get('metaObject') is not None:
            meta_object = [MetaObjectInput.from_dictionary(x) for x in dictionary.get('metaObject')]
        user_name = dictionary.get('userName')
        user_id = dictionary.get('userId')

        # Return an object of this model
        return cls(meta_object,
                   user_name,
                   user_id)

    @classmethod
    def validate(cls, val):
        """Validates value against class schema

        Args:
            val: the value to be validated

        Returns:
            boolean : if value is valid against schema.

        """
        return SchemaValidatorWrapper.getValidator(APIHelper.get_schema_path(os.path.abspath(__file__))).is_valid(val)
