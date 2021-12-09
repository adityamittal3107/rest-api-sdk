# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from restapisdk.api_helper import APIHelper
from restapisdk.configuration import Server
from restapisdk.controllers.base_controller import BaseController
from restapisdk.http.auth.o_auth_2 import OAuth2
from restapisdk.exceptions.error_response_exception import ErrorResponseException


class DependencyController(BaseController):

    """A Controller to access Endpoints in the restapisdk API."""

    def __init__(self, config, call_back=None):
        super(DependencyController, self).__init__(config, call_back)

    def get_object_dependency(self,
                              body):
        """Does a POST request to /api/rest/v2/dependency.

        To create a table in Falcon, use this endpoint.

        Args:
            body (ApiRestV2DependencyRequest): TODO: type description here.

        Returns:
            object: Response from the API. An object with list of dependent
                objects grouped based on the type

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Prepare query URL
        _url_path = '/api/rest/v2/dependency'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.post(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        OAuth2.apply(self.config, _request)
        _response = self.execute_request(_request)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text

        return decoded
