public class MySimpleLinkedList<T> {

        private Node<T> first;
        private int size;

        public MySimpleLinkedList() {
            this.first = null;
            this.size=0;
        }
         //punto del ejercicio 1
        public void insertFront(T info) {
            Node<T> tmp = new Node<T>(info,null);
            tmp.setNext(this.first);
            this.first = tmp;
            this.size++;
        }
         //punto del ejercicio 1
        public T extractFront() {
            if (!this.isEmpty()){
                Node<T> actual = this.first;
                first=this.first.getNext();
                this.size--;
                return (T) actual;
            }
            return null;
        }
        //punto del ejercicio 1
        public boolean isEmpty() {
            return this.first == null;
        }
        //punto del ejercicio 1
        public T get(int index) {
            Node<T> temp=first;
            if(temp != null && index<size){
                for (int i=0; i<index; i++){
                    temp=temp.getNext();
                }
                return temp.getInfo();
            }
            return null;
        }
        //punto del ejercicio 1
        public int size() {
            return this.size;
        }

        //punto del ejercicio 4
        public int indexOf(int index){
            int pos=0;
            Node<T> temp=first;

            while (temp != null){
                int info = (int) temp.getInfo();
                if(info == index){
                    return pos;
                }
                pos++;
                temp=temp.getNext();
            }
            return -1;
        }
        //punto del ejercicio 1
        @Override
        public String toString() {
            String listText= "";
            Node<T> temp= this.first;
            while (temp != null){
                listText=listText + temp.getInfo().toString();
                temp=temp.getNext();
            }
            return listText;
        }


}
