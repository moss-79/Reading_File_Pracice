package codeDay54;

public class FireFox  implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening FireFox Browser");
    }

    @Override
    public void navigateTo(String ur) {

        System.out.println("Navigating to "+ur+
                " using FireFox Browser");
    }

    @Override
    public void maximize() {

        System.out.println("Maximizing FireFox Browser");
    }

    @Override
    public void closeBrowser() {

        System.out.println("Closing FireFox Browser");
    }
}


