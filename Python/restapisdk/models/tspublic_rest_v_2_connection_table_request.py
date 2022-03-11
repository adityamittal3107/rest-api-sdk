# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class TspublicRestV2ConnectionTableRequest(object):

    """Implementation of the 'Tspublic Rest V2 Connection Table Request' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of the connection
        configuration (string): A JSON object of the connection metadata. If
            this field is left empty, then the configuration saved in the
            connection is considered.    To get the tables based on a
            different configuration, include required attributes in the
            connection configuration JSON.    Example:    Get tables from
            Snowflake with a different user account than specified in the
            connection:
            {"user":"test_user","password":"test_pwd","role":"test_role"}   
            Get tables from Redshift for different database than specified in
            the connection: {"database":"test_db"}
        include_column (IncludeColumnEnum): When set to true, the response
            will include column level details as well.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "configuration": 'configuration',
        "include_column": 'includeColumn'
    }

    def __init__(self,
                 id=None,
                 configuration=None,
                 include_column='true'):
        """Constructor for the TspublicRestV2ConnectionTableRequest class"""

        # Initialize members of the class
        self.id = id
        self.configuration = configuration
        self.include_column = include_column

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
        id = dictionary.get('id')
        configuration = dictionary.get('configuration')
        include_column = dictionary.get("includeColumn") if dictionary.get("includeColumn") else 'true'

        # Return an object of this model
        return cls(id,
                   configuration,
                   include_column)
