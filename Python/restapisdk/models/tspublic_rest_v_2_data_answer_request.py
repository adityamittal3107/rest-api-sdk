# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class TspublicRestV2DataAnswerRequest(object):

    """Implementation of the 'Tspublic Rest V2 Data Answer Request' model.

    TODO: type model description here.

    Attributes:
        offset (int): The offset point, starting from where the records should
            be included in the response.    If no input is provided then
            offset starts from 0.
        batch_number (int): An alternate way to set offset for the starting
            point of the response.    The value in offset field will not be
            considered if batchNumber field has value greater than 0.   
            Offset value will be calculated as (batchNumber - 1) * batchSize. 
            It is mandatory to provide a value for batchSize with batchNumber.
            Example:    Assume response has 100 records. Now,  batchNumber is
            set as 2 and batchSize as 10, then offset value will be 10. So, 10
            records starting from 11th record will be considered.
        batch_size (int): The number of records that should be included in the
            response starting from offset position.    If no input is
            provided, then all records starting from the value provided in
            offset is included in the response.
        id (string): The GUID of the Answer
        format_type (FormatType1Enum): The format of the data in the response.
            FULL: The response comes in "column":"value" format.    COMPACT:
            The response includes only the value of the columns.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "id": 'id',
        "offset": 'offset',
        "batch_number": 'batchNumber',
        "batch_size": 'batchSize',
        "format_type": 'formatType'
    }

    def __init__(self,
                 id=None,
                 offset=0,
                 batch_number=None,
                 batch_size=None,
                 format_type='COMPACT'):
        """Constructor for the TspublicRestV2DataAnswerRequest class"""

        # Initialize members of the class
        self.offset = offset
        self.batch_number = batch_number
        self.batch_size = batch_size
        self.id = id
        self.format_type = format_type

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
        offset = dictionary.get("offset") if dictionary.get("offset") else 0
        batch_number = dictionary.get('batchNumber')
        batch_size = dictionary.get('batchSize')
        format_type = dictionary.get("formatType") if dictionary.get("formatType") else 'COMPACT'

        # Return an object of this model
        return cls(id,
                   offset,
                   batch_number,
                   batch_size,
                   format_type)
