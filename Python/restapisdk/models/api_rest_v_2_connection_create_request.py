# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class ApiRestV2ConnectionCreateRequest(object):

    """Implementation of the 'Api Rest V2 Connection Create Request' model.

    TODO: type model description here.

    Attributes:
        mtype (Type13Enum): Type of the data connection.
        name (string): Name of the connection
        description (string): A short description of the connection.
        configuration (string): A JSON object of the connection metadata. The
            metadata must include configuration attributes required to create
            the connection.    Example:    Snowflake:
            {"accountName":"testaccount","user":"test_user","password":"test_pw
            d","role":"test_role","warehouse":"test_wh","database":"test_db"} 
            Redshift:
            {"host":"test_host","port":"1234","user":"test_user","password":"te
            st_pwd","database":"test_db"}    Google BigQuery:
            {"project_id":"test_project","oauth_pvt_key":"test_key"}    Azure
            Synapse:
            {"host":"test_host","port":"1234","user":"test_user","password":"te
            st_pwd","database":"test_db"}    Teradata:
            {"host":"test_host","user":"test_user","password":"test_pwd","datab
            ase":"test_db"}    Oracle ADW:
            {"user":"test_user","password":"test_pwd","net_service_name":"test_
            srvc_name","tns_admin":"test_tns","schema":"test_schema"}   
            Starburst:
            {"host":"test_host","user":"test_user","password":"test_pwd","datab
            ase":"test_db"}    Databricks:
            {"host":"test_host","http_path":"https://test
            ","user":"test_user","password":"test_pwd"}    SAP HANA:
            {"host":"test_host","user":"test_user","password":"test_pwd","datab
            ase":"test_db"}    Denodo:
            {"host":"test_host","port":"1234","user":"test_user","password":"te
            st_pwd"}

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "mtype": 'type',
        "name": 'name',
        "configuration": 'configuration',
        "description": 'description'
    }

    def __init__(self,
                 mtype=None,
                 name=None,
                 configuration=None,
                 description=None):
        """Constructor for the ApiRestV2ConnectionCreateRequest class"""

        # Initialize members of the class
        self.mtype = mtype
        self.name = name
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
        mtype = dictionary.get('type')
        name = dictionary.get('name')
        configuration = dictionary.get('configuration')
        description = dictionary.get('description')

        # Return an object of this model
        return cls(mtype,
                   name,
                   configuration,
                   description)
