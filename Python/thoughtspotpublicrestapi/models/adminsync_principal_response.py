# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from thoughtspotpublicrestapi.api_helper import APIHelper


class AdminsyncPrincipalResponse(object):

    """Implementation of the 'AdminsyncPrincipalResponse' model.

    TODO: type model description here.

    Attributes:
        users_added (list of string): Username of list of users added
        users_deleted (list of string): Username of list of users deleted
        users_updated (list of string): Username of list of users updated
        groups_added (list of string): Group name of list of groups added
        groups_deleted (list of string): Group name of list of groups deleted
        groups_updated (list of string): Group name of list of groups updated

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "users_added": 'usersAdded',
        "users_deleted": 'usersDeleted',
        "users_updated": 'usersUpdated',
        "groups_added": 'groupsAdded',
        "groups_deleted": 'groupsDeleted',
        "groups_updated": 'groupsUpdated'
    }

    _optionals = [
        'users_added',
        'users_deleted',
        'users_updated',
        'groups_added',
        'groups_deleted',
        'groups_updated',
    ]

    def __init__(self,
                 users_added=APIHelper.SKIP,
                 users_deleted=APIHelper.SKIP,
                 users_updated=APIHelper.SKIP,
                 groups_added=APIHelper.SKIP,
                 groups_deleted=APIHelper.SKIP,
                 groups_updated=APIHelper.SKIP):
        """Constructor for the AdminsyncPrincipalResponse class"""

        # Initialize members of the class
        if users_added is not APIHelper.SKIP:
            self.users_added = users_added 
        if users_deleted is not APIHelper.SKIP:
            self.users_deleted = users_deleted 
        if users_updated is not APIHelper.SKIP:
            self.users_updated = users_updated 
        if groups_added is not APIHelper.SKIP:
            self.groups_added = groups_added 
        if groups_deleted is not APIHelper.SKIP:
            self.groups_deleted = groups_deleted 
        if groups_updated is not APIHelper.SKIP:
            self.groups_updated = groups_updated 

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

        users_added = dictionary.get("usersAdded") if dictionary.get("usersAdded") else APIHelper.SKIP
        users_deleted = dictionary.get("usersDeleted") if dictionary.get("usersDeleted") else APIHelper.SKIP
        users_updated = dictionary.get("usersUpdated") if dictionary.get("usersUpdated") else APIHelper.SKIP
        groups_added = dictionary.get("groupsAdded") if dictionary.get("groupsAdded") else APIHelper.SKIP
        groups_deleted = dictionary.get("groupsDeleted") if dictionary.get("groupsDeleted") else APIHelper.SKIP
        groups_updated = dictionary.get("groupsUpdated") if dictionary.get("groupsUpdated") else APIHelper.SKIP
        # Return an object of this model
        return cls(users_added,
                   users_deleted,
                   users_updated,
                   groups_added,
                   groups_deleted,
                   groups_updated)
