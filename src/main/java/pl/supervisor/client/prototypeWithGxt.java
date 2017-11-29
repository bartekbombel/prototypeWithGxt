package pl.supervisor.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;

public class prototypeWithGxt implements EntryPoint {

  private HorizontalLayoutContainer hlc;
  private ContentPanel cpA, cpB, cpC;

  public void onModuleLoad() {

    cpA = createStandardContentPanel(cpA, 'A');
    cpB = createStandardContentPanel(cpB, 'B');
    cpC = createStandardContentPanel(cpC, 'C');

    hlc = new HorizontalLayoutContainer();
    hlc.add(cpA, new HorizontalLayoutContainer.HorizontalLayoutData(.2, 1000));
    hlc.add(cpB, new HorizontalLayoutContainer.HorizontalLayoutData(.6, 1000));
    hlc.add(cpC, new HorizontalLayoutContainer.HorizontalLayoutData(.2, 1000));

    RootPanel.get().add(hlc);
  }

  private ContentPanel createStandardContentPanel(ContentPanel cp, char signature) {
    cp = new ContentPanel();
    cp.setBorders(true);
    cp.setHeading("Okno " + signature);
    cp.setWidget(new HTML("This is an HTML Widget in " + signature + " contentPanel"));
    return cp;
  }
}
