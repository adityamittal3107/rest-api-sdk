# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from thoughtspotpublicrestapi.models.table_input import TableInput


class TspublicRestV2ConnectionRemovetableRequest(object):

    """Implementation of the 'Tspublic Rest V2 Connection Removetable Request' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of the connection
        table (list of TableInput): A JSON array of name or GUIDs of the table
            or both. At least one input is required. Provide either table name
            or id. When both are given then id is considered

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "table": 'table'
    }

    def __init__(self,
                 id=None,
                 table=None):
        """Constructor for the TspublicRestV2ConnectionRemovetableRequest class"""

        # Initialize members of the class
        self.id = id 
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

        id = dictionary.get("id") if dictionary.get("id") else None
        table = None
        if dictionary.get('table') is not None:
            table = [TableInput.from_dictionary(x) for x in dictionary.get('table')]
        # Return an object of this model
        return cls(id,
                   table)
