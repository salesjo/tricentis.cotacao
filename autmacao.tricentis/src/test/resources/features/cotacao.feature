
@tag
Feature: Enviar cotacao de seguros Automobile
Como usuario
Quero preencher formulario de seguros
Para ralizar a cotacao
 

Background: Acessar o menu Automobile
Given que o usuario esteja na home

  Scenario: Enviar cotacao Automobile
    And escolhe o formulario
    And preencher os dados do Insira os dados do veículo
    And preencho os dados do Insira os dados do seguro
    And preencho os dados do Insira os dados do produto
    When prrencho os dados da Selecione a opção de preço
    Then sistema informa Envio de email com sucesso!



