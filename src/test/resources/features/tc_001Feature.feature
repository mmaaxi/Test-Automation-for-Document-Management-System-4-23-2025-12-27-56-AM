Feature: Validar carga de varios formatos de archivo

  Scenario: Cargar documentos de formato diferente
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento PDF
    Then el sistema acepta y muestra la vista previa del PDF

    When el usuario carga un documento DOCX
    Then el sistema acepta y muestra la vista previa del DOCX

    When el usuario carga un archivo ZIP conteniendo múltiples documentos
    Then el sistema descomprime el archivo y muestra las vistas previas de todos los documentos contenidos