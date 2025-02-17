# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from thoughtspotpublicrestapi.api_helper import APIHelper


class TspublicRestV2ConnectionUpdateRequest(object):

    """Implementation of the 'Tspublic Rest V2 Connection Update Request' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of the connection
        name (string): The text to update the name of the connection.
        description (string): The text to update the description of the
            connection.
        configuration (string): A JSON object of the connection metadata.
            Include all the configuration attributes with original value along
            with the changes required to any attribute.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "configuration": 'configuration',
        "name": 'name',
        "description": 'description'
    }

    _optionals = [
        'name',
        'description',
    ]

    def __init__(self,
                 id=None,
                 configuration=None,
                 name=APIHelper.SKIP,
                 description=APIHelper.SKIP):
        """Constructor for the TspublicRestV2ConnectionUpdateRequest class"""

        # Initialize members of the class
        self.id = id 
        if name is not APIHelper.SKIP:
            self.name = name 
        if description is not APIHelper.SKIP:
            self.description = description 
        self.configuration = configuration 

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

        id = dictionary.get("id") if dictionary.get("id") else None
        configuration = dictionary.get("configuration") if dictionary.get("configuration") else None
        name = dictionary.get("name") if dictionary.get("name") else APIHelper.SKIP
        description = dictionary.get("description") if dictionary.get("description") else APIHelper.SKIP
        # Return an object of this model
        return cls(id,
                   configuration,
                   name,
                   description)
