# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.models.group_name_and_id_input import GroupNameAndIDInput
from restapisdk.models.user_name_and_id_input import UserNameAndIDInput


class TspublicRestV2GroupUpdateRequest(object):

    """Implementation of the 'Tspublic Rest V2 Group Update Request' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the user group
        id (string): GUID of the group to update
        display_name (string): A unique display name string for the user
            group, for example, Developer group.
        visibility (Visibility3Enum): Visibility of the user group.    The
            visibility attribute is set to DEFAULT. The DEFAULT attribute
            makes the user group visible for other user groups and allows them
            to share objects.
        description (string): Description text for the group.
        privileges (list of PrivilegeEnum): A JSON array of privileges
            assigned to the group
        groups (list of GroupNameAndIDInput): A JSON array of group names or
            GUIDs or both. When both are given then id is considered
        users (list of UserNameAndIDInput): A JSON array of name of users or
            GUIDs of users or both. When both are given then id is considered
        assigned_liveboards (list of string): An array of liveboard ids to be
            assigned to the group.
        mtype (Type5Enum): Type of user group. LOCAL_GROUP indicates that the
            user is created locally in the ThoughtSpot system.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "id": 'id',
        "display_name": 'displayName',
        "visibility": 'visibility',
        "description": 'description',
        "privileges": 'privileges',
        "groups": 'groups',
        "users": 'users',
        "assigned_liveboards": 'assignedLiveboards',
        "mtype": 'type'
    }

    def __init__(self,
                 name=None,
                 id=None,
                 display_name=None,
                 visibility='DEFAULT',
                 description=None,
                 privileges=None,
                 groups=None,
                 users=None,
                 assigned_liveboards=None,
                 mtype='LOCAL_GROUP'):
        """Constructor for the TspublicRestV2GroupUpdateRequest class"""

        # Initialize members of the class
        self.name = name
        self.id = id
        self.display_name = display_name
        self.visibility = visibility
        self.description = description
        self.privileges = privileges
        self.groups = groups
        self.users = users
        self.assigned_liveboards = assigned_liveboards
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
        name = dictionary.get('name')
        id = dictionary.get('id')
        display_name = dictionary.get('displayName')
        visibility = dictionary.get("visibility") if dictionary.get("visibility") else 'DEFAULT'
        description = dictionary.get('description')
        privileges = dictionary.get('privileges')
        groups = None
        if dictionary.get('groups') is not None:
            groups = [GroupNameAndIDInput.from_dictionary(x) for x in dictionary.get('groups')]
        users = None
        if dictionary.get('users') is not None:
            users = [UserNameAndIDInput.from_dictionary(x) for x in dictionary.get('users')]
        assigned_liveboards = dictionary.get('assignedLiveboards')
        mtype = dictionary.get("type") if dictionary.get("type") else 'LOCAL_GROUP'

        # Return an object of this model
        return cls(name,
                   id,
                   display_name,
                   visibility,
                   description,
                   privileges,
                   groups,
                   users,
                   assigned_liveboards,
                   mtype)
