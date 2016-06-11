package Iterator;

import java.util.LinkedList;

/**
 * This is science implement
 * Created by Sayarasin on 6/11/2016.
 */
public class Science implements ISubject {

    private LinkedList<String> subjects;

    public Science()
    {
        subjects = new LinkedList<>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }

    @Override
    public IIterator CreateIterator()
    {
        return new ScienceIterator(subjects);
    }

    private class ScienceIterator implements IIterator {

        private LinkedList<String> subjects = null;
        int position;

        ScienceIterator(LinkedList<String> subjects) {
            this.subjects = subjects;
            position = 0;
        }

        @Override
        public void Frist() {
            position = 0;
        }

        @Override
        public String Next() {
            return subjects.get(position++);
        }

        @Override
        public Boolean IsDone() {
            return position >= subjects.size();
        }

        @Override
        public String CurrentItem() {
            return subjects.get(position);
        }
    }
}
