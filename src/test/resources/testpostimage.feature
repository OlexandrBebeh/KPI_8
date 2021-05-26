Feature: Add image to Imgur
  Everybody can add image to Imgur

  Scenario: Add image to Imgur
    Given Image "https://raw.githubusercontent.com/OlexandrBebeh/KPI-3-Test_of_program_products/master/images/superimposition_3.png"
    When I want do add image with url
    Then I should get id of added image and delete it