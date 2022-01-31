# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from restapisdk.api_helper import APIHelper
from restapisdk.configuration import Server
from restapisdk.controllers.base_controller import BaseController
from restapisdk.models.group_response import GroupResponse
from restapisdk.exceptions.error_response_exception import ErrorResponseException


class GroupController(BaseController):

    """A Controller to access Endpoints in the restapisdk API."""
    def __init__(self, config, auth_managers, call_back=None):
        super(GroupController, self).__init__(config, auth_managers, call_back)

    def get_group(self,
                  name=None,
                  id=None):
        """Does a GET request to /api/rest/v2/group.

        To get the details of a specific group by name or id, use this
        endpoint. 
         At least one value needed. When both are given,then id will be
         considered to fetch user information.

        Args:
            name (string, optional): Name of the group
            id (string, optional): The GUID of the group

        Returns:
            GroupResponse: Response from the API. Details of the group

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/group'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_parameters = {
            'name': name,
            'id': id
        }
        _query_builder = APIHelper.append_url_with_query_parameters(
            _query_builder,
            _query_parameters
        )
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'accept': 'application/json',
            'Content-Type': self.config.content_type
        }

        # Prepare and execute request
        _request = self.config.http_client.get(_query_url, headers=_headers)
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = APIHelper.json_deserialize(_response.text, GroupResponse.from_dictionary)

        return decoded

    def create_group(self,
                     body):
        """Does a POST request to /api/rest/v2/group/create.

        To programmatically create a group in the ThoughtSpot system, use this
        API endpoint. 
         Using this API, you can create a group and assign privileges and
         users. 
         For ease of user management and access control, ThoughtSpot
         administrators can create groups and assign privileges to these
         groups. 
         The privileges determine the actions that the users belonging to a
         group are allowed to do. 
         ThoughtSpot also has a default group called ALL_GROUP. When you
         create new group in ThoughtSpot, they are automatically added to
         ALL_GROUP. You cannot delete the ALL_GROUP or remove members from
         it.

        Args:
            body (ApiRestV2GroupCreateRequest): TODO: type description here.

        Returns:
            GroupResponse: Response from the API. Details of the group
                created

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/group/create'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'accept': 'application/json',
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.post(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = APIHelper.json_deserialize(_response.text, GroupResponse.from_dictionary)

        return decoded

    def update_group(self,
                     body):
        """Does a PUT request to /api/rest/v2/group/update.

        You can use this endpoint to programmatically modify an existing
        group. 
         To modify a group, you require admin user privileges. 
         At least one of id or name is required to update the group. When both
         are given, then id will be considered and group name will be
         updated.

        Args:
            body (ApiRestV2GroupUpdateRequest): TODO: type description here.

        Returns:
            bool: Response from the API. Group successfully updated

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/group/update'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.put(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded

    def delete_group(self,
                     name=None,
                     id=None):
        """Does a DELETE request to /api/rest/v2/group/delete.

        To remove a group from the ThoughtSpot system, send a DELETE request
        to this endpoint. 
         At least one value needed. When both are given,then user id will be
         considered to fetch user information.

        Args:
            name (string, optional): Name of the group.
            id (string, optional): The GUID of the group

        Returns:
            bool: Response from the API. Group successfully deleted

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/group/delete'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_parameters = {
            'name': name,
            'id': id
        }
        _query_builder = APIHelper.append_url_with_query_parameters(
            _query_builder,
            _query_parameters
        )
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': self.config.content_type
        }

        # Prepare and execute request
        _request = self.config.http_client.delete(_query_url, headers=_headers)
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded

    def add_privileges_to_group(self,
                                body):
        """Does a PUT request to /api/rest/v2/group/addprivilege.

        To programmatically add privileges to an existing group, use API
        endpoint. 
         When you assign privileges to a group, all the users under to this
         group inherits the privileges assigned to that group. 
         At least one of id or name of group is required. When both are
         given,then user id will be considered.

        Args:
            body (ApiRestV2GroupAddprivilegeRequest): TODO: type description
                here.

        Returns:
            bool: Response from the API. Successfully assigned privileges to
                the group

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/group/addprivilege'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.put(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded

    def remove_privileges_from_group(self,
                                     body):
        """Does a PUT request to /api/rest/v2/group/removeprivilege.

        To programmatically remove privileges from a group, use API endpoint.
                 The API removes only the privilege association. It does not delete
         the privilege or group from the Thoughtspot system. 
         At least one of id or name of group is required. When both are
         given,then user id will be considered.

        Args:
            body (ApiRestV2GroupRemoveprivilegeRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API. Successfully removed privileges to
                the group

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/group/removeprivilege'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.put(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded

    def add_users_to_group(self,
                           body):
        """Does a PUT request to /api/rest/v2/group/adduser.

        To programmatically add existing ThoughtSpot users to a group, use
        this API endpoint. 
         hen you assign users to a group, the users inherits the privileges
         assigned to that group. 
         At least one of id or name of the group is required. When both are
         given,then user id will be considered.

        Args:
            body (ApiRestV2GroupAdduserRequest): TODO: type description here.

        Returns:
            bool: Response from the API. Successfully added user to the group

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/group/adduser'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.put(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded

    def remove_users_from_group(self,
                                body):
        """Does a PUT request to /api/rest/v2/group/removeuser.

        To programmatically remove users from a group, use API endpoint. 
         The API removes only the user association. It does not delete the
         users or group from the Thoughtspot system. 
         At least one of id or name of group is required. When both are
         given,then user id will be considered.

        Args:
            body (ApiRestV2GroupRemoveuserRequest): TODO: type description
                here.

        Returns:
            bool: Response from the API. Successfully removed user from the
                groups

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/group/removeuser'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.put(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded

    def add_groups_to_group(self,
                            body):
        """Does a PUT request to /api/rest/v2/group/addgroup.

        To programmatically add existing groups to a group, use API endpoint.
                 When you assign groups to a group, the group inherits the privileges
         assigned to those groups. 
         At least one of id or name of group is required. When both are
         given,then user id will be considered.

        Args:
            body (ApiRestV2GroupAddgroupRequest): TODO: type description
                here.

        Returns:
            bool: Response from the API. Successfully added groups to the
                group

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/group/addgroup'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.put(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded

    def remove_groups_from_group(self,
                                 body):
        """Does a PUT request to /api/rest/v2/group/removegroup.

        To programmatically remove groups from a group, use API endpoint. 
         The API removes only the group association. It does not delete the
         group from the Thoughtspot system. 
         At least one of id or name of group is required. When both are
         given,then user id will be considered.

        Args:
            body (ApiRestV2GroupRemovegroupRequest): TODO: type description
                here.

        Returns:
            bool: Response from the API. Successfully removed groups from
                group

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/group/removegroup'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.put(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text == 'true'

        return decoded

    def search_groups(self,
                      body):
        """Does a POST request to /api/rest/v2/group/search.

        To get the details of a specific group account or all groups in the
        ThoughtSpot system use this end point. 
         If no inputs are provided, then all groups are included in the
         response.

        Args:
            body (ApiRestV2GroupSearchRequest): TODO: type description here.

        Returns:
            list of GroupResponse: Response from the API.  Array of group
                details matching the search criteria

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/group/search'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'accept': 'application/json',
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.post(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = APIHelper.json_deserialize(_response.text, GroupResponse.from_dictionary)

        return decoded
