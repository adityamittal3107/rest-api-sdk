# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class ApiRestV2DatabaseTableCreateRequest(object):

    """Implementation of the 'Api Rest V2 Database Table Create Request' model.

    TODO: type model description here.

    Attributes:
        create_database (bool): Flag to indicate if the database and schema
            should be created if they do not exist in Falcon. (Valid values:
            True/False)
        schema (string): DDL of the table to be created.    Example:   
            {"database":{"name":"geo"},   
            "schema":{"name":"falcon_default_schema"},   
            "table":{"id":{"name":"test_table"},   
            "primary_key":[{"name":"test_pk"}],    "column":[   
            {"id":{"name":"test_pk"},"size":0,"data_type":"TYPE_INT32"},   
            {"id":{"name":"test_col1"},"size":0,"data_type":"TYPE_FLOAT"},   
            {"id":{"name":"test_col2"},"data_type":"TYPE_INT64","datetime":"TYP
            E_DATE"},   
            {"id":{"name":"test_col3"},"size":10,"data_type":"TYPE_VAR_CHAR"} 
            ]    }    }

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "create_database": 'createDatabase',
        "schema": 'schema'
    }

    def __init__(self,
                 create_database=True,
                 schema=None):
        """Constructor for the ApiRestV2DatabaseTableCreateRequest class"""

        # Initialize members of the class
        self.create_database = create_database
        self.schema = schema

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
        create_database = dictionary.get("createDatabase") if dictionary.get("createDatabase") else True
        schema = dictionary.get('schema')

        # Return an object of this model
        return cls(create_database,
                   schema)
