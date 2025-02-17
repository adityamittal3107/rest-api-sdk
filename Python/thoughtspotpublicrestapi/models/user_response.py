# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""
from thoughtspotpublicrestapi.api_helper import APIHelper
from thoughtspotpublicrestapi.models.group_name_and_id import GroupNameAndID
from thoughtspotpublicrestapi.models.org_type import OrgType
from thoughtspotpublicrestapi.models.user_name_and_id import UserNameAndID


class UserResponse(object):

    """Implementation of the 'UserResponse' model.

    TODO: type model description here.

    Attributes:
        name (string): Username of the user account
        display_name (string): Display name of the user account
        id (string): GUID of the user account
        visibility (string): Visibility of the user account
        mail (string): Email of the user account
        groups (list of GroupNameAndID): Name of the group to which user
            account is added
        privileges (list of string): Privileges assigned to user account
        orgs (list of OrgType): The organizations that user belongs to
        tags (list of string): Tags assigned to the user
        state (string): Indicates if the user account is active or inactive
        notify_on_share (bool): Indicates if the email should be sent when
            object is shared with the user
        show_walk_me (bool): Indicates if the walk me should be shown when
            logging in
        analyst_onboarding_complete (bool): Indicates if the onboarding is
            completed for the user
        first_login (int): Indicates if the use is logging in for the first
            time
        welcome_email_sent (bool): Indicates if the welcome email is sent to
            email associated with the user account
        is_deleted (bool): Indicates if the user account is deleted
        is_hidden (bool): Indicates if the user account is hidden
        is_external (bool): Indicates if the user account is from external
            system isDeprecated
        is_deprecated (bool): TODO: type description here.
        complete (bool): Indicates if the all the properties of user account
            is provided
        is_super_user (bool): Indicates if the user account is super user
        is_system_principal (bool): Indicates if the user account is system
            principal
        mtype (string): Indicates the type of user account
        parenttype (string): Indicates the type of parent object
        tenant_id (string): Tenant id associated with the user account
        index_version (float): TODO: type description here.
        generation_num (float): TODO: type description here.
        created (float): Date and time when user account was created
        modified (float): Date and time of last modification of user account
        author (UserNameAndID): TODO: type description here.
        modified_by (UserNameAndID): TODO: type description here.
        owner (UserNameAndID): TODO: type description here.

    """

    # Create a mapping from Model property names to API property names
    _names = {
        "name": 'name',
        "display_name": 'displayName',
        "id": 'id',
        "visibility": 'visibility',
        "mail": 'mail',
        "groups": 'groups',
        "privileges": 'privileges',
        "orgs": 'orgs',
        "tags": 'tags',
        "state": 'state',
        "notify_on_share": 'notifyOnShare',
        "show_walk_me": 'showWalkMe',
        "analyst_onboarding_complete": 'analystOnboardingComplete',
        "first_login": 'firstLogin',
        "welcome_email_sent": 'welcomeEmailSent',
        "is_deleted": 'isDeleted',
        "is_hidden": 'isHidden',
        "is_external": 'isExternal',
        "is_deprecated": 'isDeprecated',
        "complete": 'complete',
        "is_super_user": 'isSuperUser',
        "is_system_principal": 'isSystemPrincipal',
        "mtype": 'type',
        "parenttype": 'parenttype',
        "tenant_id": 'tenantId',
        "index_version": 'indexVersion',
        "generation_num": 'generationNum',
        "created": 'created',
        "modified": 'modified',
        "author": 'author',
        "modified_by": 'modifiedBy',
        "owner": 'owner'
    }

    _optionals = [
        'name',
        'display_name',
        'id',
        'visibility',
        'mail',
        'groups',
        'privileges',
        'orgs',
        'tags',
        'state',
        'notify_on_share',
        'show_walk_me',
        'analyst_onboarding_complete',
        'first_login',
        'welcome_email_sent',
        'is_deleted',
        'is_hidden',
        'is_external',
        'is_deprecated',
        'complete',
        'is_super_user',
        'is_system_principal',
        'mtype',
        'parenttype',
        'tenant_id',
        'index_version',
        'generation_num',
        'created',
        'modified',
        'author',
        'modified_by',
        'owner',
    ]

    def __init__(self,
                 name=APIHelper.SKIP,
                 display_name=APIHelper.SKIP,
                 id=APIHelper.SKIP,
                 visibility=APIHelper.SKIP,
                 mail=APIHelper.SKIP,
                 groups=APIHelper.SKIP,
                 privileges=APIHelper.SKIP,
                 orgs=APIHelper.SKIP,
                 tags=APIHelper.SKIP,
                 state=APIHelper.SKIP,
                 notify_on_share=APIHelper.SKIP,
                 show_walk_me=APIHelper.SKIP,
                 analyst_onboarding_complete=APIHelper.SKIP,
                 first_login=APIHelper.SKIP,
                 welcome_email_sent=APIHelper.SKIP,
                 is_deleted=APIHelper.SKIP,
                 is_hidden=APIHelper.SKIP,
                 is_external=APIHelper.SKIP,
                 is_deprecated=APIHelper.SKIP,
                 complete=APIHelper.SKIP,
                 is_super_user=APIHelper.SKIP,
                 is_system_principal=APIHelper.SKIP,
                 mtype=APIHelper.SKIP,
                 parenttype=APIHelper.SKIP,
                 tenant_id=APIHelper.SKIP,
                 index_version=APIHelper.SKIP,
                 generation_num=APIHelper.SKIP,
                 created=APIHelper.SKIP,
                 modified=APIHelper.SKIP,
                 author=APIHelper.SKIP,
                 modified_by=APIHelper.SKIP,
                 owner=APIHelper.SKIP):
        """Constructor for the UserResponse class"""

        # Initialize members of the class
        if name is not APIHelper.SKIP:
            self.name = name 
        if display_name is not APIHelper.SKIP:
            self.display_name = display_name 
        if id is not APIHelper.SKIP:
            self.id = id 
        if visibility is not APIHelper.SKIP:
            self.visibility = visibility 
        if mail is not APIHelper.SKIP:
            self.mail = mail 
        if groups is not APIHelper.SKIP:
            self.groups = groups 
        if privileges is not APIHelper.SKIP:
            self.privileges = privileges 
        if orgs is not APIHelper.SKIP:
            self.orgs = orgs 
        if tags is not APIHelper.SKIP:
            self.tags = tags 
        if state is not APIHelper.SKIP:
            self.state = state 
        if notify_on_share is not APIHelper.SKIP:
            self.notify_on_share = notify_on_share 
        if show_walk_me is not APIHelper.SKIP:
            self.show_walk_me = show_walk_me 
        if analyst_onboarding_complete is not APIHelper.SKIP:
            self.analyst_onboarding_complete = analyst_onboarding_complete 
        if first_login is not APIHelper.SKIP:
            self.first_login = first_login 
        if welcome_email_sent is not APIHelper.SKIP:
            self.welcome_email_sent = welcome_email_sent 
        if is_deleted is not APIHelper.SKIP:
            self.is_deleted = is_deleted 
        if is_hidden is not APIHelper.SKIP:
            self.is_hidden = is_hidden 
        if is_external is not APIHelper.SKIP:
            self.is_external = is_external 
        if is_deprecated is not APIHelper.SKIP:
            self.is_deprecated = is_deprecated 
        if complete is not APIHelper.SKIP:
            self.complete = complete 
        if is_super_user is not APIHelper.SKIP:
            self.is_super_user = is_super_user 
        if is_system_principal is not APIHelper.SKIP:
            self.is_system_principal = is_system_principal 
        if mtype is not APIHelper.SKIP:
            self.mtype = mtype 
        if parenttype is not APIHelper.SKIP:
            self.parenttype = parenttype 
        if tenant_id is not APIHelper.SKIP:
            self.tenant_id = tenant_id 
        if index_version is not APIHelper.SKIP:
            self.index_version = index_version 
        if generation_num is not APIHelper.SKIP:
            self.generation_num = generation_num 
        if created is not APIHelper.SKIP:
            self.created = created 
        if modified is not APIHelper.SKIP:
            self.modified = modified 
        if author is not APIHelper.SKIP:
            self.author = author 
        if modified_by is not APIHelper.SKIP:
            self.modified_by = modified_by 
        if owner is not APIHelper.SKIP:
            self.owner = owner 

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
        display_name = dictionary.get("displayName") if dictionary.get("displayName") else APIHelper.SKIP
        id = dictionary.get("id") if dictionary.get("id") else APIHelper.SKIP
        visibility = dictionary.get("visibility") if dictionary.get("visibility") else APIHelper.SKIP
        mail = dictionary.get("mail") if dictionary.get("mail") else APIHelper.SKIP
        groups = None
        if dictionary.get('groups') is not None:
            groups = [GroupNameAndID.from_dictionary(x) for x in dictionary.get('groups')]
        else:
            groups = APIHelper.SKIP
        privileges = dictionary.get("privileges") if dictionary.get("privileges") else APIHelper.SKIP
        orgs = None
        if dictionary.get('orgs') is not None:
            orgs = [OrgType.from_dictionary(x) for x in dictionary.get('orgs')]
        else:
            orgs = APIHelper.SKIP
        tags = dictionary.get("tags") if dictionary.get("tags") else APIHelper.SKIP
        state = dictionary.get("state") if dictionary.get("state") else APIHelper.SKIP
        notify_on_share = dictionary.get("notifyOnShare") if "notifyOnShare" in dictionary.keys() else APIHelper.SKIP
        show_walk_me = dictionary.get("showWalkMe") if "showWalkMe" in dictionary.keys() else APIHelper.SKIP
        analyst_onboarding_complete = dictionary.get("analystOnboardingComplete") if "analystOnboardingComplete" in dictionary.keys() else APIHelper.SKIP
        first_login = dictionary.get("firstLogin") if dictionary.get("firstLogin") else APIHelper.SKIP
        welcome_email_sent = dictionary.get("welcomeEmailSent") if "welcomeEmailSent" in dictionary.keys() else APIHelper.SKIP
        is_deleted = dictionary.get("isDeleted") if "isDeleted" in dictionary.keys() else APIHelper.SKIP
        is_hidden = dictionary.get("isHidden") if "isHidden" in dictionary.keys() else APIHelper.SKIP
        is_external = dictionary.get("isExternal") if "isExternal" in dictionary.keys() else APIHelper.SKIP
        is_deprecated = dictionary.get("isDeprecated") if "isDeprecated" in dictionary.keys() else APIHelper.SKIP
        complete = dictionary.get("complete") if "complete" in dictionary.keys() else APIHelper.SKIP
        is_super_user = dictionary.get("isSuperUser") if "isSuperUser" in dictionary.keys() else APIHelper.SKIP
        is_system_principal = dictionary.get("isSystemPrincipal") if "isSystemPrincipal" in dictionary.keys() else APIHelper.SKIP
        mtype = dictionary.get("type") if dictionary.get("type") else APIHelper.SKIP
        parenttype = dictionary.get("parenttype") if dictionary.get("parenttype") else APIHelper.SKIP
        tenant_id = dictionary.get("tenantId") if dictionary.get("tenantId") else APIHelper.SKIP
        index_version = dictionary.get("indexVersion") if dictionary.get("indexVersion") else APIHelper.SKIP
        generation_num = dictionary.get("generationNum") if dictionary.get("generationNum") else APIHelper.SKIP
        created = dictionary.get("created") if dictionary.get("created") else APIHelper.SKIP
        modified = dictionary.get("modified") if dictionary.get("modified") else APIHelper.SKIP
        author = UserNameAndID.from_dictionary(dictionary.get('author')) if 'author' in dictionary.keys() else APIHelper.SKIP 
        modified_by = UserNameAndID.from_dictionary(dictionary.get('modifiedBy')) if 'modifiedBy' in dictionary.keys() else APIHelper.SKIP 
        owner = UserNameAndID.from_dictionary(dictionary.get('owner')) if 'owner' in dictionary.keys() else APIHelper.SKIP 
        # Return an object of this model
        return cls(name,
                   display_name,
                   id,
                   visibility,
                   mail,
                   groups,
                   privileges,
                   orgs,
                   tags,
                   state,
                   notify_on_share,
                   show_walk_me,
                   analyst_onboarding_complete,
                   first_login,
                   welcome_email_sent,
                   is_deleted,
                   is_hidden,
                   is_external,
                   is_deprecated,
                   complete,
                   is_super_user,
                   is_system_principal,
                   mtype,
                   parenttype,
                   tenant_id,
                   index_version,
                   generation_num,
                   created,
                   modified,
                   author,
                   modified_by,
                   owner)
