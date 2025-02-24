# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from thoughtspotpublicrestapi.api_helper import APIHelper


class ClientState(object):

    """Implementation of the 'ClientState' model.

    TODO: type model description here.

    Attributes:
        color (string): Color assigned to the tag

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "color": 'color'
    }

    _optionals = [
        'color',
    ]

    def __init__(self,
                 color=APIHelper.SKIP):
        """Constructor for the ClientState class"""

        # Initialize members of the class
        if color is not APIHelper.SKIP:
            self.color = color 

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

        color = dictionary.get("color") if dictionary.get("color") else APIHelper.SKIP
        # Return an object of this model
        return cls(color)
