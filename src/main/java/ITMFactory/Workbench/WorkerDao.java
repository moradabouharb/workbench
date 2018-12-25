package ITMFactory.Workbench;

import ITMFactory.Workbench.Model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WorkerDao extends JpaRepository<Worker,String> {

    @Query(value = "select c from Worker c")
    List<Worker> getallworker();

    @Query(value = "select c from Worker c where c.RFID like %?1")
    List<Worker> GetWorkerByRFID(String name);
}