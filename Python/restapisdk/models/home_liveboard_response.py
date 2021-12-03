# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class HomeLiveboardResponse(object):

    """Implementation of the 'HomeLiveboardResponse' model.

    TODO: type model description here.

    Attributes:
        user_name (string): Name of the user
        user_id (string): The GUID of the user
        liveboard_name (string): Name of the liveboard
        liveboard_id (string): The GUID of the liveboard

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "user_name": 'userName',
        "user_id": 'userId',
        "liveboard_name": 'liveboardName',
        "liveboard_id": 'liveboardId'
    }

    def __init__(self,
                 user_name=None,
                 user_id=None,
                 liveboard_name=None,
                 liveboard_id=None):
        """Constructor for the HomeLiveboardResponse class"""

        # Initialize members of the class
        self.user_name = user_name
        self.user_id = user_id
        self.liveboard_name = liveboard_name
        self.liveboard_id = liveboard_id

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
        liveboard_name = dictionary.get('liveboardName')
        liveboard_id = dictionary.get('liveboardId')

        # Return an object of this model
        return cls(user_name,
                   user_id,
                   liveboard_name,
                   liveboard_id)

    @classmethod
    def validate(cls, val):
        """Validates value against class schema

        Args:
            val: the value to be validated

        Returns:
            boolean : if value is valid against schema.

        """
        return SchemaValidatorWrapper.getValidator(APIHelper.get_schema_path(os.path.abspath(__file__))).is_valid(val)
