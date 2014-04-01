package component_listeners;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Components.CTabbedPane;

public class TextAreaDocumentListener implements DocumentListener{

	@Override
	public void changedUpdate(DocumentEvent arg0) {

	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		
		if(!CTabbedPane.getInstance().getPanel().isNeedsToBeSaved()){
			CTabbedPane.getInstance().getPanel().setNeedsToBeSaved(true);
			CTabbedPane.getInstance().setTitleAt(CTabbedPane.getInstance().getSelectedIndex(), CTabbedPane.getInstance().getTitleAt(CTabbedPane.getInstance().getSelectedIndex())+"*");
		}
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		
		if(!CTabbedPane.getInstance().getPanel().isNeedsToBeSaved()){
			CTabbedPane.getInstance().getPanel().setNeedsToBeSaved(true);
			CTabbedPane.getInstance().setTitleAt(CTabbedPane.getInstance().getSelectedIndex(), CTabbedPane.getInstance().getTitleAt(CTabbedPane.getInstance().getSelectedIndex())+"*");
		}
	}

}
