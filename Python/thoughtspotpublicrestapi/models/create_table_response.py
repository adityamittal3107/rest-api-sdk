# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from thoughtspotpublicrestapi.api_helper import APIHelper
from thoughtspotpublicrestapi.models.logical_table_header import LogicalTableHeader


class CreateTableResponse(object):

    """Implementation of the 'CreateTableResponse' model.

    TODO: type model description here.

    Attributes:
        logical_table_header (LogicalTableHeader): TODO: type description
            here.
        physical_table_id (string): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "logical_table_header": 'logicalTableHeader',
        "physical_table_id": 'physicalTableId'
    }

    _optionals = [
        'logical_table_header',
        'physical_table_id',
    ]

    def __init__(self,
                 logical_table_header=APIHelper.SKIP,
                 physical_table_id=APIHelper.SKIP):
        """Constructor for the CreateTableResponse class"""

        # Initialize members of the class
        if logical_table_header is not APIHelper.SKIP:
            self.logical_table_header = logical_table_header 
        if physical_table_id is not APIHelper.SKIP:
            self.physical_table_id = physical_table_id 

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

        logical_table_header = LogicalTableHeader.from_dictionary(dictionary.get('logicalTableHeader')) if 'logicalTableHeader' in dictionary.keys() else APIHelper.SKIP 
        physical_table_id = dictionary.get("physicalTableId") if dictionary.get("physicalTableId") else APIHelper.SKIP
        # Return an object of this model
        return cls(logical_table_header,
                   physical_table_id)
