# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class LiveboardNameAndID(object):

    """Implementation of the 'LiveboardNameAndID' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the liveboard
        id (string): GUID of the liveboard

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "id": 'id'
    }

    def __init__(self,
                 name=None,
                 id=None):
        """Constructor for the LiveboardNameAndID class"""

        # Initialize members of the class
        self.name = name
        self.id = id

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
        id = dictionary.get('id')

        # Return an object of this model
        return cls(name,
                   id)
