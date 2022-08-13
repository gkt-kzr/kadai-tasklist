package models.validators;

import models.Task;

public class TaskValidator {
    // バリデーションを実行する
    public static String validate(Task t) {
        if (t.getContent() == null || t.getContent().equals("")) {
            return "タスクを入力してください。";
        }

        return "";
    }
}