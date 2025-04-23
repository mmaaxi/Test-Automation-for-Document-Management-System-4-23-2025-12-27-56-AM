package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("el usuario carga un documento PDF")
    public void el_usuario_carga_un_documento_pdf() {
        page.uploadPDF();
    }

    @Then("el sistema acepta y muestra la vista previa del PDF")
    public void el_sistema_acepta_y_muestra_la_vista_previa_del_pdf() {
        page.verifyPDFPreviewIsDisplayed();
    }
    
    @When("el usuario carga un documento DOCX")
    public void el_usuario_carga_un_documento_docx() {
        page.uploadDOCX();
    }

    @Then("el sistema acepta y muestra la vista previa del DOCX")
    public void el_sistema_acepta_y_muestra_la_vista_previa_del_docx() {
        page.verifyDOCXPreviewIsDisplayed();
    }

    @When("el usuario carga un archivo ZIP conteniendo múltiples documentos")
    public void el_usuario_carga_un_archivo_zip_contendiendo_multiples_documentos() {
        page.uploadZIP();
    }

    @Then("el sistema descomprime el archivo y muestra las vistas previas de todos los documentos contenidos")
    public void el_sistema_descomprime_el_archivo_y_muestra_las_vistas_previas_de_todos_los_documentos_contenidos() {
        page.verifyZIPContentsPreviewIsDisplayed();
    }
}