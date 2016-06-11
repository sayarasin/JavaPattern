package Iterator;

/**
 * This is implement of arts
 * Created by Sayarasin on 6/11/2016.
 */
public class Arts implements ISubject {

    private String [] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Chinese";
        subjects[1] = "Japanese";
    }

    @Override
    public IIterator CreateIterator() {
        return new ArtsIterator(subjects);
    }

    private class ArtsIterator implements IIterator {

        private String[] subjects;
        private int position;

        ArtsIterator(String [] subjects) {
            this.subjects = subjects;
            position = 0;
        }

        @Override
        public void Frist() {
            position = 0;
        }

        @Override
        public String Next() {
            return subjects[position++];
        }

        @Override
        public Boolean IsDone() {
           return position >= subjects.length;
        }

        @Override
        public String CurrentItem() {
            return subjects[position];
        }
    }
}
