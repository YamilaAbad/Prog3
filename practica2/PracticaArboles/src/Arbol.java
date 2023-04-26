public class Arbol {
        private int value;
        private Arbol left;
        private Arbol right;

        public Arbol(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public Integer getValue() {
            return value;
        }

        public void add(int newValue) {
            if (newValue < this.value) {
                if (this.left == null)
                    this.left = new Arbol(newValue);
                else
                    this.left.add(newValue);
            } else if (newValue > this.value) {
                if (this.right == null)
                    this.right = new Arbol(newValue);
                else
                    this.right.add(newValue);
            }
        }


    }
