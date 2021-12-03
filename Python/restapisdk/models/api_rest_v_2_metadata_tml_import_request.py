# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class ApiRestV2MetadataTmlImportRequest(object):

    """Implementation of the 'Api Rest V2 Metadata Tml Import Request' model.

    TODO: type model description here.

    Attributes:
        object_tml (list of string): A JSON array of TML objects to upload, in
            YAML or JSON format. If in YAML format within the JSON array, use
            escape characters for YAML quotes, and new line characters when
            there is a new line
        import_policy (ImportPolicyEnum): Policy to follow during import
        force_create (bool): Specifies if you are updating or creating
            objects. To create new objects, specify true. By default,
            ThoughtSpot updates existing objects that have the same GUID as
            the objects you are importing. When set to true, the GUID property
            in the imported TML is replaced on the server, and the response
            headers will include the id_guid property with the GUID of the new
            object. The new object will be assigned a new GUID, even if the
            imported TML file included a guid value. Thus, there is no need to
            include the guid in the TML file if you are using
            forceCreate=true.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "object_tml": 'objectTML',
        "import_policy": 'importPolicy',
        "force_create": 'forceCreate'
    }

    def __init__(self,
                 object_tml=None,
                 import_policy='PARTIAL',
                 force_create=False):
        """Constructor for the ApiRestV2MetadataTmlImportRequest class"""

        # Initialize members of the class
        self.object_tml = object_tml
        self.import_policy = import_policy
        self.force_create = force_create

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
        object_tml = dictionary.get('objectTML')
        import_policy = dictionary.get("importPolicy") if dictionary.get("importPolicy") else 'PARTIAL'
        force_create = dictionary.get("forceCreate") if dictionary.get("forceCreate") else False

        # Return an object of this model
        return cls(object_tml,
                   import_policy,
                   force_create)

    @classmethod
    def validate(cls, val):
        """Validates value against class schema

        Args:
            val: the value to be validated

        Returns:
            boolean : if value is valid against schema.

        """
        return SchemaValidatorWrapper.getValidator(APIHelper.get_schema_path(os.path.abspath(__file__))).is_valid(val)
