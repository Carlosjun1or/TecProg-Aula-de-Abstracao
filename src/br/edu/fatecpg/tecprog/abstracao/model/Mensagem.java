package br.edu.fatecpg.tecprog.abstracao.model;

public class Mensagem {


		private int idMensagem;
		private String conteudo;
		private String dataEnvio;
		private String remetente;
		private String destinatario;

		public Mensagem(int idMensagem, String conteudo, String dataEnvio, String remetente, String destinatario) {
			this.idMensagem = idMensagem;
			this.conteudo = conteudo;
			this.dataEnvio = dataEnvio;
			this.remetente = remetente;
			this.destinatario = destinatario;
		}

		public int getIdMensagem() {
			return idMensagem;
		}

		public void setIdMensagem(int idMensagem) {
			this.idMensagem = idMensagem;
		}

		public String getConteudo() {
			return conteudo;
		}

		public void setConteudo(String conteudo) {
			this.conteudo = conteudo;
		}

		public String getDataEnvio() {
			return dataEnvio;
		}

		public void setDataEnvio(String dataEnvio) {
			this.dataEnvio = dataEnvio;
		}

		public String getRemetente() {
			return remetente;
		}

		public void setRemetente(String remetente) {
			this.remetente = remetente;
		}

		public String getDestinatario() {
			return destinatario;
		}

		public void setDestinatario(String destinatario) {
			this.destinatario = destinatario;
		}

		public void enviarMensagem() {
			System.out.println("Mensagem enviada de " + remetente + " para " + destinatario + ": " + conteudo);
		}

		public void editarMensagem(String novoConteudo) {
			this.conteudo = novoConteudo;
			System.out.println("Mensagem atualizada: " + conteudo);
		}

		public void excluirMensagem() {
			System.out.println("Mensagem ID " + idMensagem + " foi excluída.");
		}
	}

