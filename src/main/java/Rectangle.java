public class Rectangle {
    int width;
    int height;

    Rectangle (int someWidth, int someHeigth) {
        this.width = someWidth;
        this.height = someHeigth;
    }

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public int calculateArea () {
        return this.width * this.height;
    }
}
