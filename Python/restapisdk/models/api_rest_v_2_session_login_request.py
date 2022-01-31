# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""


class ApiRestV2SessionLoginRequest(object):

    """Implementation of the 'Api Rest V2 Session Login Request' model.

    TODO: type model description here.

    Attributes:
        user_name (string): Username of the user account
        password (string): The password of the user account
        remember_me (bool): A flag to remember the user session. When set to
            true, sets a session cookie that persists in subsequent API
            calls.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "user_name": 'userName',
        "password": 'password',
        "remember_me": 'rememberMe'
    }

    def __init__(self,
                 user_name=None,
                 password=None,
                 remember_me=False):
        """Constructor for the ApiRestV2SessionLoginRequest class"""

        # Initialize members of the class
        self.user_name = user_name
        self.password = password
        self.remember_me = remember_me

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
        user_name = dictionary.get('userName')
        password = dictionary.get('password')
        remember_me = dictionary.get("rememberMe") if dictionary.get("rememberMe") else False

        # Return an object of this model
        return cls(user_name,
                   password,
                   remember_me)
