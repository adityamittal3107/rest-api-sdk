# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from restapisdk.models.group_name_and_id_input import GroupNameAndIDInput


class ApiRestV2UserUpdateRequest(object):

    """Implementation of the 'Api Rest V2 User Update Request' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the user account. The username string must be
            unique.
        id (string): The GUID of the user account
        display_name (string): A display name string for the user, usually
            their first and last name.
        visibility (Visibility1Enum): Visibility of the user account.    The
            visibility attribute is set to DEFAULT when creating a user. The
            DEFAULT attribute makes a user visible to other users and user
            groups, and thus allows them to share objects.
        mail (string): Email id associated with the user account
        password (string): Password for the user account.
        state (StateEnum): Status of user account. acitve or inactive.
        notify_on_share (bool): User preference for receiving email
            notifications when another ThoughtSpot user shares answers or
            pinboards.
        show_walk_me (bool): The user preference for revisiting the onboarding
            experience.
        analyst_onboarding_complete (bool): ThoughtSpot provides an
            interactive guided walkthrough to onboard new users. The
            onboarding experience leads users through a set of actions to help
            users get started and accomplish their tasks quickly.    The users
            can turn off the Onboarding experience and access it again when
            they need assistance with the ThoughtSpot UI.
        mtype (Type2Enum): Type of user. LOCAL_USER indicates that the user is
            created locally in the ThoughtSpot system.
        groups (list of GroupNameAndIDInput): A JSON array of group names or
            GUIDs or both. When both are given then id is considered

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "id": 'id',
        "display_name": 'displayName',
        "visibility": 'visibility',
        "mail": 'mail',
        "password": 'password',
        "state": 'state',
        "notify_on_share": 'notifyOnShare',
        "show_walk_me": 'showWalkMe',
        "analyst_onboarding_complete": 'analystOnboardingComplete',
        "mtype": 'type',
        "groups": 'groups'
    }

    def __init__(self,
                 name=None,
                 id=None,
                 display_name=None,
                 visibility='DEFAULT',
                 mail=None,
                 password=None,
                 state='ACTIVE',
                 notify_on_share=True,
                 show_walk_me=True,
                 analyst_onboarding_complete=False,
                 mtype='LOCAL_USER',
                 groups=None):
        """Constructor for the ApiRestV2UserUpdateRequest class"""

        # Initialize members of the class
        self.name = name
        self.id = id
        self.display_name = display_name
        self.visibility = visibility
        self.mail = mail
        self.password = password
        self.state = state
        self.notify_on_share = notify_on_share
        self.show_walk_me = show_walk_me
        self.analyst_onboarding_complete = analyst_onboarding_complete
        self.mtype = mtype
        self.groups = groups

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
        mail = dictionary.get('mail')
        password = dictionary.get('password')
        state = dictionary.get("state") if dictionary.get("state") else 'ACTIVE'
        notify_on_share = dictionary.get("notifyOnShare") if dictionary.get("notifyOnShare") else True
        show_walk_me = dictionary.get("showWalkMe") if dictionary.get("showWalkMe") else True
        analyst_onboarding_complete = dictionary.get("analystOnboardingComplete") if dictionary.get("analystOnboardingComplete") else False
        mtype = dictionary.get("type") if dictionary.get("type") else 'LOCAL_USER'
        groups = None
        if dictionary.get('groups') is not None:
            groups = [GroupNameAndIDInput.from_dictionary(x) for x in dictionary.get('groups')]

        # Return an object of this model
        return cls(name,
                   id,
                   display_name,
                   visibility,
                   mail,
                   password,
                   state,
                   notify_on_share,
                   show_walk_me,
                   analyst_onboarding_complete,
                   mtype,
                   groups)
