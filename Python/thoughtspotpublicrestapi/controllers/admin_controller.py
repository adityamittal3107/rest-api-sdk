# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from thoughtspotpublicrestapi.api_helper import APIHelper
from thoughtspotpublicrestapi.configuration import Server
from thoughtspotpublicrestapi.controllers.base_controller import BaseController
from apimatic_core.request_builder import RequestBuilder
from apimatic_core.response_handler import ResponseHandler
from apimatic_core.types.parameter import Parameter
from thoughtspotpublicrestapi.http.http_method_enum import HttpMethodEnum
from apimatic_core.authentication.multiple.single_auth import Single
from apimatic_core.authentication.multiple.and_auth_group import And
from apimatic_core.authentication.multiple.or_auth_group import Or
from thoughtspotpublicrestapi.models.adminsync_principal_response import AdminsyncPrincipalResponse
from thoughtspotpublicrestapi.exceptions.error_response_exception import ErrorResponseException


class AdminController(BaseController):

    """A Controller to access Endpoints in the thoughtspotpublicrestapi API."""
    def __init__(self, config):
        super(AdminController, self).__init__(config)

    def restapi_v_2__update_cluster_config(self,
                                           body):
        """Does a PUT request to /tspublic/rest/v2/admin/configuration/update.

        To update the Thoughtspot cluster configuration, use this endpoint.

        Args:
            body (TspublicRestV2AdminConfigurationUpdateRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/admin/configuration/update')
            .http_method(HttpMethodEnum.PUT)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__reset_user_password(self,
                                         body):
        """Does a PUT request to /tspublic/rest/v2/admin/resetpassword.

        To reset the password of a ThoughtSpot user account, use this
        endpoint. 
        It is mandatory to use Authorization header with token of a user with
        admin access to successfully run this endpoint. 
        At least one of User Id or username is mandatory. When both are given,
        then user id will be considered.

        Args:
            body (TspublicRestV2AdminResetpasswordRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/admin/resetpassword')
            .http_method(HttpMethodEnum.PUT)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__sync_principal(self,
                                    body):
        """Does a PUT request to /tspublic/rest/v2/admin/syncprincipal.

        To programmatically synchronize user accounts and user groups from
        external system with ThoughtSpot, use this endpoint. 
         The payload takes principals containing all users and groups present
         in the external system. 
         The users and user groups in Thoughtspot get updated for any matching
         inputs. 
         Any user and user group present in the input, but not present in the
         cluster, gets created in cluster. 
        n You can optionally choose to delete the user and groups from the
        cluster, that are not present in the input.

        Args:
            body (TspublicRestV2AdminSyncprincipalRequest): TODO: type
                description here.

        Returns:
            AdminsyncPrincipalResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/admin/syncprincipal')
            .http_method(HttpMethodEnum.PUT)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(AdminsyncPrincipalResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__change_author_of_objects(self,
                                              body):
        """Does a PUT request to /tspublic/rest/v2/admin/changeauthor.

        To programmatically change the owner of one or several objects from
        one user account to another, use this endpoint. 
        You might want to transfer ownership of objects owned by a user to
        another active user, when the account is removed from the ThoughtSpot
        application.

        Args:
            body (TspublicRestV2AdminChangeauthorRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/admin/changeauthor')
            .http_method(HttpMethodEnum.PUT)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__assign_author_to_objects(self,
                                              body):
        """Does a PUT request to /tspublic/rest/v2/admin/assignauthor.

        To programmatically assign an author to one or several objects, use
        this endpoint. 
        Provide either user name or id as input. When both are given user id
        will be considered. 
        Requires administration privilege.

        Args:
            body (TspublicRestV2AdminAssignauthorRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/admin/assignauthor')
            .http_method(HttpMethodEnum.PUT)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__force_logout_users(self,
                                        body):
        """Does a POST request to /tspublic/rest/v2/admin/forcelogout.

        To logout one or more users from logged in session, use this endpoint.
        If no input is provided then all logged in users are force logged out.
                Requires administration privilege

        Args:
            body (TspublicRestV2AdminForcelogoutRequest): TODO: type
                description here.

        Returns:
            bool: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/admin/forcelogout')
            .http_method(HttpMethodEnum.POST)
            .header_param(Parameter()
                          .key('Content-Type')
                          .value('application/json'))
            .body_param(Parameter()
                        .value(body)
                        .is_required(True))
            .body_serializer(APIHelper.json_serialize)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()
