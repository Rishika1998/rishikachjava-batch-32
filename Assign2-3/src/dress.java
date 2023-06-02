class dress {
        public void dresstype() {
            System.out.println("type of a dress");
        }
    }

    class jeans extends dress {
        @Override
        public void dresstype() {
            System.out.println("jeans");
        }
    }

    class skirts extends dress {
        @Override
        public void dresstype() {
            System.out.println("skirts");
        }
    }


