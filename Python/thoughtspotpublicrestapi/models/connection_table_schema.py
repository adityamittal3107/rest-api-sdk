# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from thoughtspotpublicrestapi.api_helper import APIHelper
from thoughtspotpublicrestapi.models.connection_column import ConnectionColumn


class ConnectionTableSchema(object):

    """Implementation of the 'ConnectionTableSchema' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the schema
        table (list of ConnectionColumn): List of table details

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "table": 'table'
    }

    _optionals = [
        'name',
        'table',
    ]

    def __init__(self,
                 name=APIHelper.SKIP,
                 table=APIHelper.SKIP):
        """Constructor for the ConnectionTableSchema class"""

        # Initialize members of the class
        if name is not APIHelper.SKIP:
            self.name = name 
        if table is not APIHelper.SKIP:
            self.table = table 

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

        name = dictionary.get("name") if dictionary.get("name") else APIHelper.SKIP
        table = None
        if dictionary.get('table') is not None:
            table = [ConnectionColumn.from_dictionary(x) for x in dictionary.get('table')]
        else:
            table = APIHelper.SKIP
        # Return an object of this model
        return cls(name,
                   table)
