# -*- coding: utf-8 -*-

"""
thoughtspotpublicrestapi

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

import json
import dateutil.parser

from tests.controllers.controller_test_base import ControllerTestBase
from apimatic_core.utilities.comparison_helper import ComparisonHelper
from thoughtspotpublicrestapi.api_helper import APIHelper


class SecurityControllerTests(ControllerTestBase):

    @classmethod
    def setUpClass(cls):
        super(SecurityControllerTests, cls).setUpClass()
        cls.controller = cls.client.security
        cls.response_catcher = cls.controller.http_call_back

    # Use this endpoint to list the objects on which a user or user group has permission. The response will include only those objects on which the user or user group has either VIEW OR MODIFY permission. 
    #
    #Requires administration privilege
    def test_restapi_v_2__get_permission_for_principal(self):
        # Parameters for the API call
        id = None
        name = None

        # Perform the API call through the SDK function
        result = self.controller.restapi_v_2__get_permission_for_principal(id, name)

        # Test response code
        assert self.response_catcher.response.status_code == 200

        # Test headers
        expected_headers = {}
        expected_headers['content-type'] = 'application/json'

        assert ComparisonHelper.match_headers(expected_headers, self.response_catcher.response.headers)


