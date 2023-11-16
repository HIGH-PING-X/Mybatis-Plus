package games.highping.mybatisplus00.bean;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.time.LocalDateTime;

@Data
//@TableName("noob_user")    指定表名字
public class User {
    //TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String username;
    private String email;
    private LocalDateTime dateRegistered;
    @TableLogic
    private Integer tableLogic; //逻辑删除字段
}
