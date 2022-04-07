# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class TspublicRestV2ReportAnswerRequest(object):

    """Implementation of the 'Tspublic Rest V2 Report Answer Request' model.

    TODO: type model description here.

    Attributes:
        id (string): GUID of the Answer to download.
        mtype (Type16Enum): Type of file to be generated.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "mtype": 'type'
    }

    def __init__(self,
                 id=None,
                 mtype='CSV'):
        """Constructor for the TspublicRestV2ReportAnswerRequest class"""

        # Initialize members of the class
        self.id = id
        self.mtype = mtype

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
        mtype = dictionary.get("type") if dictionary.get("type") else 'CSV'

        # Return an object of this model
        return cls(id,
                   mtype)
