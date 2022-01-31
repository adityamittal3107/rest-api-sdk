# -*- coding: utf-8 -*-

"""
restapisdk

This file was automatically generated by APIMATIC v3.0 (
 https://www.apimatic.io ).
"""

import unittest
from restapisdk.configuration import Configuration
from restapisdk.configuration import Environment
from restapisdk.restapisdk_client import RestapisdkClient


class ControllerTestBase(unittest.TestCase):

    """All test classes inherit from this base class. It abstracts out
    common functionality and configuration variables set up."""

    @classmethod
    def setUpClass(cls):
        """Class method called once before running tests in a test class."""
        cls.request_timeout = 30
        cls.assert_precision = 0.01
        cls.config = ControllerTestBase.create_configuration()
        cls.client = RestapisdkClient()
        cls.auth_managers = cls.client.auth_managers
    @staticmethod
    def create_configuration():
        return Configuration(access_token='')
