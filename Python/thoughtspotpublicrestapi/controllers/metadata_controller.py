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
from apimatic_core.types.array_serialization_format import SerializationFormats
from apimatic_core.authentication.multiple.single_auth import Single
from apimatic_core.authentication.multiple.and_auth_group import And
from apimatic_core.authentication.multiple.or_auth_group import Or
from thoughtspotpublicrestapi.models.metadata_tag_response import MetadataTagResponse
from thoughtspotpublicrestapi.models.home_liveboard_response import HomeLiveboardResponse
from thoughtspotpublicrestapi.exceptions.error_response_exception import ErrorResponseException


class MetadataController(BaseController):

    """A Controller to access Endpoints in the thoughtspotpublicrestapi API."""
    def __init__(self, config):
        super(MetadataController, self).__init__(config)

    def restapi_v_2__get_tag(self,
                             name=None,
                             id=None):
        """Does a GET request to /tspublic/rest/v2/metadata/tag.

        To get details of a specific tag, use this endpoint. At least one of
        id or name of tag is required. When both are given, then id will be
        considered.

        Args:
            name (string, optional): Name of the tag
            id (string, optional): The GUID of the tag

        Returns:
            MetadataTagResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/metadata/tag')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('name')
                         .value(name))
            .query_param(Parameter()
                         .key('id')
                         .value(id))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(MetadataTagResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__get_home_liveboard(self,
                                        user_name=None,
                                        user_id=None):
        """Does a GET request to /tspublic/rest/v2/metadata/homeliveboard.

        To get the name and id of liveboard that is set as a home liveboard
        for a user, use this endpoint. At least one of user id or username is
        required. When both are given, then id will be considered.

        Args:
            user_name (string, optional): Name of the tag
            user_id (string, optional): The GUID of the tag

        Returns:
            HomeLiveboardResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/metadata/homeliveboard')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('userName')
                         .value(user_name))
            .query_param(Parameter()
                         .key('userId')
                         .value(user_id))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .deserialize_into(HomeLiveboardResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__search_object_header(self,
                                          body):
        """Does a POST request to /tspublic/rest/v2/metadata/header/search.

        To get header details for metadata objects, use this endpoint. You can
        provide as input selective fields to get the data for.

        Args:
            body (TspublicRestV2MetadataHeaderSearchRequest): TODO: type
                description here.

        Returns:
            object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/metadata/header/search')
            .http_method(HttpMethodEnum.POST)
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
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__get_object_visualization_header(self,
                                                     id):
        """Does a GET request to /tspublic/rest/v2/metadata/vizheader.

        Use this endpoint to get header details of visualization charts for a
        given liveboard or answer. At least one of id or name of liveboard or
        answer is required. When both are given, then id will be considered.

        Args:
            id (string): The GUID of the liveboard or answer

        Returns:
            list of object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/metadata/vizheader')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('id')
                         .value(id)
                         .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__get_object_detail(self,
                                       mtype,
                                       id):
        """Does a GET request to /tspublic/rest/v2/metadata/detail.

        Use this endpoint to get full details of metadata objects

        Args:
            mtype (Type4Enum): Type of the metadata object being searched.
            id (list of string): A JSON array of GUIDs of the objects.

        Returns:
            object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/metadata/detail')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('type')
                         .value(mtype)
                         .is_required(True))
            .query_param(Parameter()
                         .key('id')
                         .value(id)
                         .is_required(True))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .array_serialization_format(SerializationFormats.PLAIN)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__get_object_header(self,
                                       mtype,
                                       id,
                                       output_fields=None):
        """Does a GET request to /tspublic/rest/v2/metadata/header.

        To get header detail of a metadata object, use this endpoint. You can
        provide as input selective fields to get the data for.

        Args:
            mtype (Type5Enum): Type of the metadata object being searched.
            id (string): GUID of the metadata object
            output_fields (list of string, optional): Array of header field
                names that need to be included in the header response

        Returns:
            object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/metadata/header')
            .http_method(HttpMethodEnum.GET)
            .query_param(Parameter()
                         .key('type')
                         .value(mtype)
                         .is_required(True))
            .query_param(Parameter()
                         .key('id')
                         .value(id)
                         .is_required(True))
            .query_param(Parameter()
                         .key('outputFields')
                         .value(output_fields))
            .header_param(Parameter()
                          .key('accept')
                          .value('application/json'))
            .array_serialization_format(SerializationFormats.PLAIN)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__search_object_detail(self,
                                          body):
        """Does a POST request to /tspublic/rest/v2/metadata/detail/search.

        Use this endpoint to get full details of metadata objects

        Args:
            body (TspublicRestV2MetadataDetailSearchRequest): TODO: type
                description here.

        Returns:
            object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/metadata/detail/search')
            .http_method(HttpMethodEnum.POST)
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
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__create_tag(self,
                                body):
        """Does a POST request to /tspublic/rest/v2/metadata/tag/create.

        To programmatically create tags, use this endpoint

        Args:
            body (TspublicRestV2MetadataTagCreateRequest): TODO: type
                description here.

        Returns:
            MetadataTagResponse: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/metadata/tag/create')
            .http_method(HttpMethodEnum.POST)
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
            .deserialize_into(MetadataTagResponse.from_dictionary)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__update_tag(self,
                                body):
        """Does a PUT request to /tspublic/rest/v2/metadata/tag/update.

        To programmatically update tags, use this endpoint. At least one of id
        or name of tag is required. When both are given, then id will be
        considered.

        Args:
            body (TspublicRestV2MetadataTagUpdateRequest): TODO: type
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
            .path('/tspublic/rest/v2/metadata/tag/update')
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

    def restapi_v_2__delete_tag(self,
                                name=None,
                                id=None):
        """Does a DELETE request to /tspublic/rest/v2/metadata/tag/delete.

        To programmatically delete tags, use this endpoint. At least one of id
        or name of tag is required. When both are given, then id will be
        considered.

        Args:
            name (string, optional): Name of the tag
            id (string, optional): The GUID of the tag

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
            .path('/tspublic/rest/v2/metadata/tag/delete')
            .http_method(HttpMethodEnum.DELETE)
            .query_param(Parameter()
                         .key('name')
                         .value(name))
            .query_param(Parameter()
                         .key('id')
                         .value(id))
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__assign_tag(self,
                                body):
        """Does a PUT request to /tspublic/rest/v2/metadata/tag/assign.

        To programmatically assign tags to a metadata object, such as a
        liveboard, search answer, table, worksheet, or view, use this
        endpoint.  At least one of id or name of tag is required. When both
        are given, then id will be considered.

        Args:
            body (TspublicRestV2MetadataTagAssignRequest): TODO: type
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
            .path('/tspublic/rest/v2/metadata/tag/assign')
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

    def restapi_v_2__unassign_tag(self,
                                  body):
        """Does a PUT request to /tspublic/rest/v2/metadata/tag/unassign.

        To programmatically unassign tags to a metadata object, such as a
        liveboard, search answer, table, worksheet, or view, use this
        endpoint. At least one of id or name of tag is required. When both are
        given, then id will be considered.

        Args:
            body (TspublicRestV2MetadataTagUnassignRequest): TODO: type
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
            .path('/tspublic/rest/v2/metadata/tag/unassign')
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

    def restapi_v_2__assign_favorite(self,
                                     body):
        """Does a PUT request to /tspublic/rest/v2/metadata/favorite/assign.

        To programmatically assign objects to favorites for a given user
        account, use this endpoint. At least one of user id or username is
        required. When both are given, then id will be considered.

        Args:
            body (TspublicRestV2MetadataFavoriteAssignRequest): TODO: type
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
            .path('/tspublic/rest/v2/metadata/favorite/assign')
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

    def restapi_v_2__unassign_favorite(self,
                                       body):
        """Does a PUT request to /tspublic/rest/v2/metadata/favorite/unassign.

        To programmatically unassign objects to favorites for a given user
        account, use this endpoint. At least one of user id or username is
        required. When both are given, then id will be considered.

        Args:
            body (TspublicRestV2MetadataFavoriteUnassignRequest): TODO: type
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
            .path('/tspublic/rest/v2/metadata/favorite/unassign')
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

    def restapi_v_2__assign_home_liveboard(self,
                                           body):
        """Does a PUT request to /tspublic/rest/v2/metadata/homeliveboard/assign.

        To assign a specific liveboard as a home liveboard for a user, use
        this endpoint. At least one of user id or username is required. When
        both are given, then id will be considered.

        Args:
            body (TspublicRestV2MetadataHomeliveboardAssignRequest): TODO:
                type description here.

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
            .path('/tspublic/rest/v2/metadata/homeliveboard/assign')
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

    def restapi_v_2__unassign_home_liveboard(self,
                                             body):
        """Does a PUT request to /tspublic/rest/v2/metadata/homeliveboard/unassign.

        To unassign the home liveboard set for a user, use this endpoint. At
        least one of user id or username is required. When both are given,
        then id will be considered.

        Args:
            body (TspublicRestV2MetadataHomeliveboardUnassignRequest): TODO:
                type description here.

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
            .path('/tspublic/rest/v2/metadata/homeliveboard/unassign')
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

    def restapi_v_2__export_object_tml(self,
                                       body):
        """Does a POST request to /tspublic/rest/v2/metadata/tml/export.

        To export ThoughtSpot objects represented in ThoughtSpot Modeling
        Language (TML), use this endpoint

        Args:
            body (TspublicRestV2MetadataTmlExportRequest): TODO: type
                description here.

        Returns:
            object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/metadata/tml/export')
            .http_method(HttpMethodEnum.POST)
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
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__import_object_tml(self,
                                       body):
        """Does a POST request to /tspublic/rest/v2/metadata/tml/import.

        To import ThoughtSpot objects represented in ThoughtSpot Modeling
        Language (TML), use this endpoint

        Args:
            body (TspublicRestV2MetadataTmlImportRequest): TODO: type
                description here.

        Returns:
            object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/metadata/tml/import')
            .http_method(HttpMethodEnum.POST)
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
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__delete_object(self,
                                   mtype,
                                   id):
        """Does a DELETE request to /tspublic/rest/v2/metadata/delete.

        Use this endpoint to delete the metadata objects

        Args:
            mtype (Type4Enum): Type of the metadata object being searched
            id (list of string): A JSON array of GUIDs of the objects

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
            .path('/tspublic/rest/v2/metadata/delete')
            .http_method(HttpMethodEnum.DELETE)
            .query_param(Parameter()
                         .key('type')
                         .value(mtype)
                         .is_required(True))
            .query_param(Parameter()
                         .key('id')
                         .value(id)
                         .is_required(True))
            .array_serialization_format(SerializationFormats.PLAIN)
            .auth(Single('global'))
        ).response(
            ResponseHandler()
            .deserializer(APIHelper.json_deserialize)
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()

    def restapi_v_2__get_object_dependency(self,
                                           body):
        """Does a POST request to /tspublic/rest/v2/metadata/dependency.

        To query the details of dependent objects and associate objects as
        dependents, you can use this API. Dependency is defined as relation
        between referenced and referencing objects. A referencing object is
        said to have a dependency on a referenced object, if the referenced
        object cannot be deleted without first deleting the referencing
        object. For example, consider a worksheet 'W1' that has a derived
        logical column 'C1' that has a reference to a base logical column
        'C2'. This can be shown diagramatically as: W1-->C1-->C2. W1 has a
        dependency on C2 i.e. W1 is a referencing object and C2 is a
        referenced object. It is not possible to delete C2 without first
        deleting W1 because deletion of C2 will be prevented by the
        relationship between W1's column C1 and C2. Similarly C1 is said to
        have a dependency on C2 i.e. C1 is a referencing object and C2 is a
        referenced object. It is not possible to delete C2 without first
        deleting C1

        Args:
            body (TspublicRestV2MetadataDependencyRequest): TODO: type
                description here.

        Returns:
            object: Response from the API.

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        return super().new_api_call_builder.request(
            RequestBuilder().server(Server.DEFAULT)
            .path('/tspublic/rest/v2/metadata/dependency')
            .http_method(HttpMethodEnum.POST)
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
            .local_error('500', 'Operation failed', ErrorResponseException)
        ).execute()
