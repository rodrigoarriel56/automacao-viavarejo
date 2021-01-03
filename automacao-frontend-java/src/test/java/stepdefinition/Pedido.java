/**
 * A Classe Pedido é responsável selecionar o produto e inserir no carrinho
 *
 * @author Rodrigo Arriel <rodrigoarriel56@gmail.com>
 * @version 1.0
 */


package stepdefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import frontutils.PropertiesHelper;
import pages.PedidoPage;
import java.util.Properties;


public class Pedido {
	
    @SuppressWarnings("static-access")
	private Properties properties = new PropertiesHelper().getProperties();
    private PedidoPage pedidoPage;

    public Pedido() {
    	pedidoPage = new PedidoPage(Hooks.driver);
    }
    
    // Acessa a URL do site das casas Bahia

    @Dado("^que estou no site das casas bahia através da url \"([^\"]*)\"$")
    public void que_estou_no_site_das_casas_bahia_através_da_url(String url) throws Throwable {
    	pedidoPage.setUrl(properties.getProperty(url));
    }

    // Preenche o campo busca

    @Quando("^preencho o campo busca \"([^\"]*)\"$")
    public void preencho_o_campo_busca(String strBusca) throws Throwable {
    	pedidoPage.submitFieldCampoBusca(strBusca);
    }

    // seleciono o produto na grid

    @Quando("^seleciono o produto na grid \"([^\"]*)\"$")
    public void seleciono_o_produto_na_grid() throws Throwable {
    	pedidoPage.submitFieldSelecioneProduto();
    }

    // filtro os produtos apresentados

    @Quando("^filtro os produtos apresentados")
    public void filtro_os_produtos_apresentados() throws Throwable {
        pedidoPage.submitFieldVendidoEntregue();
        pedidoPage.submitFieldFiltroProduto();
        pedidoPage.submitFieldFiltroCategoria();
        pedidoPage.submitFieldFiltro();
        pedidoPage.submitFieldListaFavoritos();
        pedidoPage.submitFieldDetalhesProduto();
    }
    
    @Quando("^seleciono o detalhes do produto")
    public void seleciono_o_detalhes_do_produto() throws Throwable {
    	pedidoPage.submitFieldDetalhesProduto();
        
    }
    
    @Quando("^preencho campo cep \"([^\"]*)\"$")
    public void preencho_campo_cep(String frete) throws Throwable {
    	pedidoPage.setFieldBtnFrete(frete);
    	pedidoPage.submitFieldBtnContinuar();        
    }
    
    @E("^aciono o botao continuar")
    public void aciono_o_botao_continuar() throws Throwable {
    	pedidoPage.submitFieldBtnContinuar();
    	        
    }
    
    @E("^aciono botao comprar mais produtos")
    public void aciono_botao_comprar_mais_produtos() throws Throwable {
    	pedidoPage.submitFieldBtnComprarMaisProdutos();
    	        
    }
    
    @Quando("^aciono carrinho na home")
    public void aciono_carrinho_na_home() throws Throwable {
    	pedidoPage.submitFieldBtnCarrinho();
    	        
    }    

    @Então("^sera apresentado o produto no carrinho")
    public void sera_apresentado_o_produto_no_carrinho() throws Throwable {
        
    }

    
}
