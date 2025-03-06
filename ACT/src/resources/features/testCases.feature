Feature: Realizar compras no site

  Scenario 1: Realizar compra com sucesso
    Given eu acessei o site e estou na página de login
    When eu faço login com usuário "performance_glitch_user" e senha "secret_sauce"
    And eu ordeno os produtos por "NAME Z TO A"
    And eu adiciono o produto no carrinho
    And eu realizo o checkout
    Then a compra deve ser finalizada com sucesso

  Scenario 2: Tentar realizar uma compra com falha
    Given eu acessei o site e estou na página de login
    When eu faço login com usuário "problem_user" e senha "secret_sauce"
    And eu adiciono o produto no carrinho
    And eu tento realizar o checkout
    Then o checkout deve falhar
