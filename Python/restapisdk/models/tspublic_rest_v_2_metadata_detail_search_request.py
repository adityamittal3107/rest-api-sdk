# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class TspublicRestV2MetadataDetailSearchRequest(object):

    """Implementation of the 'Tspublic Rest V2 Metadata Detail Search Request' model.

    TODO: type model description here.

    Attributes:
        mtype (SearchObjectDetailTypeEnum): Type of the metadata object being
            searched. Valid values
        id (list of string): A JSON array of GUIDs of the objects.
        show_hidden (SearchObjectDetailShowHiddenEnum): When set to true,
            returns details of the hidden objects, such as a column in a
            worksheet or a table.
        drop_question_details (SearchObjectDetailDropQuestionDetailsEnum):
            When set to true, the search assist data associated with a
            worksheet is not included in the API response. This attribute is
            applicable only for DATAOBJECT data type.
        version (string): Specify the version to retrieve the objects from. By
            default, the API returns metadata for all versions of the object.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "mtype": 'type',
        "id": 'id',
        "show_hidden": 'showHidden',
        "drop_question_details": 'dropQuestionDetails',
        "version": 'version'
    }

    def __init__(self,
                 mtype=None,
                 id=None,
                 show_hidden='false',
                 drop_question_details='false',
                 version=None):
        """Constructor for the TspublicRestV2MetadataDetailSearchRequest class"""

        # Initialize members of the class
        self.mtype = mtype
        self.id = id
        self.show_hidden = show_hidden
        self.drop_question_details = drop_question_details
        self.version = version

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
        id = dictionary.get('id')
        show_hidden = dictionary.get("showHidden") if dictionary.get("showHidden") else 'false'
        drop_question_details = dictionary.get("dropQuestionDetails") if dictionary.get("dropQuestionDetails") else 'false'
        version = dictionary.get('version')
        # Return an object of this model
        return cls(mtype,
                   id,
                   show_hidden,
                   drop_question_details,
                   version)
