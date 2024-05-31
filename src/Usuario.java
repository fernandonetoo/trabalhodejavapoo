public class Usuario {
        private String nome;
        private String senha;

        public Usuario() {
            this.nome = nome;
            this.senha = senha;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public void fazerLogin() {
            System.out.println(nome + " fez login.");
        }

        public void sair() {
            System.out.println(nome + " saiu.");
        }
}
