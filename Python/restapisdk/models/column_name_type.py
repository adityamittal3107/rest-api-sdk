# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class ColumnNameType(object):

    """Implementation of the 'ColumnNameType' model.

    TODO: type model description here.

    Attributes:
        name (string): TODO: type description here.
        mtype (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "mtype": 'type'
    }

    def __init__(self,
                 name=None,
                 mtype=None):
        """Constructor for the ColumnNameType class"""

        # Initialize members of the class
        self.name = name
        self.mtype = mtype

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
        name = dictionary.get('name')
        mtype = dictionary.get('type')

        # Return an object of this model
        return cls(name,
                   mtype)

    @classmethod
    def validate(cls, val):
        """Validates value against class schema

        Args:
            val: the value to be validated

        Returns:
            boolean : if value is valid against schema.

        """
        return SchemaValidatorWrapper.getValidator(APIHelper.get_schema_path(os.path.abspath(__file__))).is_valid(val)
