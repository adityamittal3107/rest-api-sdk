# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class ApiRestV2GroupRemoveprivilegeRequest(object):

    """Implementation of the 'Api Rest V2 Group Removeprivilege Request' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the group
        id (string): The GUID of the group to query.
        privileges (list of PrivilegeEnum): List of privileges

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "id": 'id',
        "privileges": 'privileges'
    }

    def __init__(self,
                 name=None,
                 id=None,
                 privileges=None):
        """Constructor for the ApiRestV2GroupRemoveprivilegeRequest class"""

        # Initialize members of the class
        self.name = name
        self.id = id
        self.privileges = privileges

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
        privileges = dictionary.get('privileges')

        # Return an object of this model
        return cls(name,
                   id,
                   privileges)
