package com.veezean.idea.plugin.codereviewer.action.element;

import com.intellij.openapi.ui.ComboBox;
import com.veezean.idea.plugin.codereviewer.model.Column;
import com.veezean.idea.plugin.codereviewer.model.ValuePair;

import javax.swing.*;

/**
 * 下拉框界面元素构造器
 *
 * @author Veezean, 公众号 @架构悟道
 * @since 2023/2/4
 */
public class CombBoxCreator implements IElementCreator {

    @Override
    public JComponent create(Column column, boolean editable) {
        ComboBox<ValuePair> comboBox =
                new ComboBox<>(column.getEnumValues().toArray(new ValuePair[0]));
        comboBox.setEditable(editable);
        return comboBox;
    }
}
