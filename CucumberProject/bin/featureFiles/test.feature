Feature: Testing Site Search

@Runme

Scenario: Searching for Cinglevue

Given I navigate to the cinglevue website

When I search for cinglevue in the site search

Then the search result has more than 10 links