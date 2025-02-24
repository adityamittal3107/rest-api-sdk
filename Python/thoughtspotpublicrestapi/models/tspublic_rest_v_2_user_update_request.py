# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from thoughtspotpublicrestapi.api_helper import APIHelper
from thoughtspotpublicrestapi.models.group_name_and_id_input import GroupNameAndIDInput


class TspublicRestV2UserUpdateRequest(object):

    """Implementation of the 'Tspublic Rest V2 User Update Request' model.

    TODO: type model description here.

    Attributes:
        name (string): Name of the user. The username string must be unique.
        id (string): The GUID of the user account to query
        display_name (string): A unique display name string for the user,
            usually their first and last name.
        visibility (Visibility1Enum): Visibility of the user account. The
            visibility attribute is set to DEFAULT when creating a user. The
            DEFAULT attribute makes a user visible to other users and user
            groups, and thus allows them to share objects.
        mail (string): email of the user.
        state (State1Enum): Status of user account. acitve or inactive.
        notify_on_share (bool): User preference for receiving email
            notifications when another ThoughtSpot user shares answers or
            pinboards.
        show_walk_me (bool): The user preference for revisiting the onboarding
            experience.
        analyst_onboarding_complete (bool): ThoughtSpot provides an
            interactive guided walkthrough to onboard new users. The
            onboarding experience leads users through a set of actions to help
            users get started and accomplish their tasks quickly. The users
            can turn off the Onboarding experience and access it again when
            they need assistance with the ThoughtSpot UI.
        mtype (Type9Enum): Type of user. LOCAL_USER indicates that the user is
            created locally in the ThoughtSpot system.
        groups (list of GroupNameAndIDInput): Array of objects of groups that
            the user belong to.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "id": 'id',
        "display_name": 'displayName',
        "visibility": 'visibility',
        "mail": 'mail',
        "state": 'state',
        "notify_on_share": 'notifyOnShare',
        "show_walk_me": 'showWalkMe',
        "analyst_onboarding_complete": 'analystOnboardingComplete',
        "mtype": 'type',
        "groups": 'groups'
    }

    _optionals = [
        'name',
        'id',
        'display_name',
        'visibility',
        'mail',
        'state',
        'notify_on_share',
        'show_walk_me',
        'analyst_onboarding_complete',
        'mtype',
        'groups',
    ]

    def __init__(self,
                 name=APIHelper.SKIP,
                 id=APIHelper.SKIP,
                 display_name=APIHelper.SKIP,
                 visibility='DEFAULT',
                 mail=APIHelper.SKIP,
                 state='ACTIVE',
                 notify_on_share=True,
                 show_walk_me=True,
                 analyst_onboarding_complete=False,
                 mtype='LOCAL_USER',
                 groups=APIHelper.SKIP):
        """Constructor for the TspublicRestV2UserUpdateRequest class"""

        # Initialize members of the class
        if name is not APIHelper.SKIP:
            self.name = name 
        if id is not APIHelper.SKIP:
            self.id = id 
        if display_name is not APIHelper.SKIP:
            self.display_name = display_name 
        self.visibility = visibility 
        if mail is not APIHelper.SKIP:
            self.mail = mail 
        self.state = state 
        self.notify_on_share = notify_on_share 
        self.show_walk_me = show_walk_me 
        self.analyst_onboarding_complete = analyst_onboarding_complete 
        self.mtype = mtype 
        if groups is not APIHelper.SKIP:
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

        name = dictionary.get("name") if dictionary.get("name") else APIHelper.SKIP
        id = dictionary.get("id") if dictionary.get("id") else APIHelper.SKIP
        display_name = dictionary.get("displayName") if dictionary.get("displayName") else APIHelper.SKIP
        visibility = dictionary.get("visibility") if dictionary.get("visibility") else 'DEFAULT'
        mail = dictionary.get("mail") if dictionary.get("mail") else APIHelper.SKIP
        state = dictionary.get("state") if dictionary.get("state") else 'ACTIVE'
        notify_on_share = dictionary.get("notifyOnShare") if dictionary.get("notifyOnShare") else True
        show_walk_me = dictionary.get("showWalkMe") if dictionary.get("showWalkMe") else True
        analyst_onboarding_complete = dictionary.get("analystOnboardingComplete") if dictionary.get("analystOnboardingComplete") else False
        mtype = dictionary.get("type") if dictionary.get("type") else 'LOCAL_USER'
        groups = None
        if dictionary.get('groups') is not None:
            groups = [GroupNameAndIDInput.from_dictionary(x) for x in dictionary.get('groups')]
        else:
            groups = APIHelper.SKIP
        # Return an object of this model
        return cls(name,
                   id,
                   display_name,
                   visibility,
                   mail,
                   state,
                   notify_on_share,
                   show_walk_me,
                   analyst_onboarding_complete,
                   mtype,
                   groups)
