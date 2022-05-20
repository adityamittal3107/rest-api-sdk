# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

from restapisdk.api_helper import APIHelper
from restapisdk.configuration import Server
from restapisdk.controllers.base_controller import BaseController
from restapisdk.exceptions.error_response_exception import ErrorResponseException


class ReportController(BaseController):

    """A Controller to access Endpoints in the restapisdk API."""
    def __init__(self, config, auth_managers):
        super(ReportController, self).__init__(config, auth_managers)

    def answer_report(self,
                      body):
        """Does a POST request to /tspublic/rest/v2/report/answer.

        To programmatically download Answer data as a file, use this endpoint.
                 The PDF will download data in the tabular format even if Answer is
         saved as chart. 
         Permission: Requires at least view access to the object and
         datadownloading privilege

        Args:
            body (TspublicRestV2ReportAnswerRequest): TODO: type description
                here.

        Returns:
            binary: Response from the API. Downloaded file for the Answer
                data

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/report/answer'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.post(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request, binary=True)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text

        return decoded

    def liveboard_report(self,
                         body):
        """Does a POST request to /tspublic/rest/v2/report/liveboard.

        To programmatically download Liveboard data or specific Visualization
        data from Liveboard as a file, use this endpoint 
         Permission: Requires at least view access to the object and
         datadownloading privilege

        Args:
            body (TspublicRestV2ReportLiveboardRequest): TODO: type
                description here.

        Returns:
            binary: Response from the API. Downloaded file for the Liveboard
                data

        Raises:
            APIException: When an error occurs while fetching the data from
                the remote API. This exception includes the HTTP Response
                code, an error message, and the HTTP body that was received in
                the request.

        """

        # Validate required parameters
        self.validate_parameters(body=body)

        # Prepare query URL
        _url_path = '/tspublic/rest/v2/report/liveboard'
        _query_builder = self.config.get_base_uri()
        _query_builder += _url_path
        _query_url = APIHelper.clean_url(_query_builder)

        # Prepare headers
        _headers = {
            'Content-Type': 'application/json'
        }

        # Prepare and execute request
        _request = self.config.http_client.post(_query_url, headers=_headers, parameters=APIHelper.json_serialize(body))
        # Apply authentication scheme on request
        self.apply_auth_schemes(_request, 'global')

        _response = self.execute_request(_request, binary=True)

        # Endpoint and global error handling using HTTP status codes.
        if _response.status_code == 500:
            raise ErrorResponseException('Operation failed or unauthorized request', _response)
        self.validate_response(_response)

        decoded = _response.text

        return decoded
